@echo off
setlocal enabledelayedexpansion
echo Running all Java tasks...
set passed=0
set failed=0

for /r %%i in (Main.java) do (
    echo Testing in %%~dpi
    pushd %%~dpi
    javac Main.java
    if errorlevel 1 (
        echo [FAIL] javac failed
        set /a failed+=1
    ) else (
        java Main
        echo [PASS]
        set /a passed+=1
    )
    popd
)
echo.
echo Complete.
