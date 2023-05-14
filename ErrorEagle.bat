@echo off
setlocal EnableDelayedExpansion
title ErrorEagle.exe

color 06
echo ===============================================================================
echo           Olá, sou o Eaglebot assistente de instalação da ErrorEagle.         
echo          Irei preparar o ambiente para prosseguirmos com a instalação.   
echo ===============================================================================

@REM -- COLOCAR O LOGO DA EMPRESA EM BAIXO
echo.
echo.

echo  EEEEEEEE  
echo  EE       R  RRR R  RRR  OOO  R  RRR
echo  EEEEEE   RR     RR     O   O RR
echo  EE       RR     RR     O   O RR
echo  EEEEEEEE RR     RR      OOO  RR

echo                EEEEEEEE                  LL  EEEEEEEE 
echo                EE        aAAAa    GGGG   LL  EE
echo                EEEEEE   A     A GG    GG LL  EEEEEE
echo                EE       A AAA A GG    GG LL  EE
echo                EEEEEEEE A     A   GGG GG LL  EEEEEEEE
echo                                       GG            
echo                                  GG  GGG                                      
echo                                   GGGG   
echo.
echo.

pause
color 07

@REM ------------------------------------------------ STATUS DO Sis. Oper ---------------------------------------------------
cls
echo.
echo EagleBot: - Primeiro irei verificar se seu Sistema Operacional está atualizado...
timeout /t 2 /nobreak > nul
echo.
echo Aguarde varredura...
timeout /t 3 /nobreak > nul
 wuauclt /detectnow
echo.

if "%errorlevel%" equ 0 (
color 0C
echo EagleBot: - Ops! Existem atualizações a serem feitas. 
echo.
echo EagleBot: - Por favor, antes de prosseguirmos atualize seu Windows.
timeout /t 3 /nobreak > nul
exit
    
) else (

echo -----------------------------------------------------------------------
systeminfo | findstr /B /C:"Nome do sistema operacional"
echo -----------------------------------------------------------------------
echo.
color 0A
echo EagleBot: - Muito bem! Seu S.O esta atualizado.

)
echo.
echo.
echo.
pause
color 07


@REM  ------------------------------------------------ Java na Máquina ---------------------------------------------------
cls

echo.
echo EagleBot: - Agora irei verificar se o Java (JRE) está instalado em sua máquina.
timeout /t 2 /nobreak > nul
echo.
echo Aguarde varredura...
echo.
timeout /t 4 /nobreak > nul
java --version
echo.


if %errorlevel% equ 0 (
    color 0A
    echo EagleBot: - Java instalado, seguiremos com a instalação do app da ErrorEagle!
    timeout /t 3 /nobreak > nul   
) else (
    color 0C
    echo EagleBot: - Java não instalado, para continuarmos é necessário ter o java instalado.
    echo EagleBot: - Acesse o site oficial da oracle e baixe o jre para prosseguirmos.
    echo https://www.oracle.com/java/technologies/javase-jre8-downloads.html
    timeout /t 3 /nobreak > nul
)

echo.
echo.
echo.
pause

@REM ------------------------------------------------ Programa ErrorEagle ---------------------------------------------------

cls
color 07
echo EagleBot: - Baixando aplicativo da ErrorEagle
echo.
echo.
timeout /t 2 /nobreak > nul
curl -o ErrorEagle.jar  https://raw.githubusercontent.com/ErrorEagle/ErrorEagle-Jar/main/tela-swing/target/ErrorEagle.jar

echo Concluindo Instalação...
echo.
echo EagleBot: - Deseja executar o programa da ErrorEagle (s/n)
set /p get4=

if "%get4%"=="s" (
    color 0A
    echo.
    echo Executando aplicação... Aguarde um momento.
    timeout /t 4 /nobreak > nul
    java -jar ErrorEagle.jar
  

) else (
    echo.
    echo Encerrando sistema!
    timeout /t 3 /nobreak > nul
    exit
)
    
    echo.
    echo EagleBot: - Obrigado por aguardar! Qualquer dúvida entre em contato pela plataforma.
    timeout /t 4 /nobreak > nul
    exit

  