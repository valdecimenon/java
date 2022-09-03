@echo off

if "%1"=="" (
   echo Use: comando NOME_DO_PROJETO
) else (
   git init
   git add .
   git commit -m "mensagem"
   git branch -M %1
   git remote add origin https://github.com/valdecimenon/java
   git push -u origin %1
)

