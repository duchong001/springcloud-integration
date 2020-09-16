cls 
@ECHO OFF 
SET NGINX_PATH=D: 
SET NGINX_DIR=D:\tools\nginx-1.18.0\
color 0a 
TITLE Nginx Management 
GOTO MENU 
:MENU 
CLS 
ECHO. 
ECHO.  Nginx Management 
ECHO. 
ECHO. 1 Start Nginx 
ECHO. 
ECHO. 2 Shutdown Nginx 
ECHO. 
ECHO. 3 Restart Nginx 
ECHO. 
ECHO. 4 Exit BAT 
ECHO. 
ECHO. 
ECHO. 
ECHO.Please select a number above
set /p ID= 
IF "%id%"=="1" GOTO cmd1 
IF "%id%"=="2" GOTO cmd2 
IF "%id%"=="3" GOTO cmd3 
IF "%id%"=="4" EXIT 
PAUSE 
:cmd1 
ECHO. 
ECHO.Satrt Nginx...... 
IF NOT EXIST %NGINX_DIR%nginx.exe ECHO %NGINX_DIR%nginx.exe not exist
%NGINX_PATH% 
cd %NGINX_DIR% 
IF EXIST %NGINX_DIR%nginx.exe start %NGINX_DIR%nginx.exe 
ECHO.OK 
PAUSE 
GOTO MENU 
:cmd2 
ECHO. 
ECHO.Shutdown Nginx...... 
taskkill /F /IM nginx.exe > nul 
ECHO.OK 
PAUSE 
GOTO MENU 
:cmd3 
ECHO. 
ECHO.Restart Nginx...... 
taskkill /F /IM nginx.exe > nul 
ECHO.OK 
GOTO cmd1 
GOTO MENU