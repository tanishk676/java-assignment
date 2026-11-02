Write-Host "Running compilation and test for all Java assignment tasks..." -ForegroundColor Cyan
$tasks = Get-ChildItem -Path . -Recurse -Filter "Main.java"
$passed = 0
$failed = 0

foreach ($file in $tasks) {
    $dir = $file.DirectoryName
    Write-Host "Testing $dir ... " -NoNewline
    Push-Location $dir
    try {
        & javac Main.java
        if ($LASTEXITCODE -ne 0) {
            Write-Host "COMPILE FAILED" -ForegroundColor Red
            $failed++
        } else {
            $output = & java Main
            Write-Host "PASSED" -ForegroundColor Green
            $passed++
        }
    } catch {
        Write-Host "ERROR: $_" -ForegroundColor Red
        $failed++
    } finally {
        Pop-Location
    }
}

Write-Host "`nSummary: $passed passed, $failed failed." -ForegroundColor $(if ($failed -eq 0) { "Green" } else { "Red" })
