
@echo off 

set path=%ProgramFiles%\Java\jdk-11.0.1\bin

REM verification de la version de JAVAC

echo ##############################
echo # Affichage du chemin du JDK #
echo ##############################

echo %path%

PAUSE

cls

echo ####################################
echo # Affichage de la version de javac #
echo ####################################

javac -version

PAUSE

cls

REM Suppression des fichiers testés si le bacth a ete precedemment execute
REM si les fichiers sont inexistants suite a l'interruption du script on ne renvoit pas d'erreur dans la console

del *.class >nul 2>&1
del resultats.txt >nul 2>&1

echo Suppression des precedents fichiers .class

PAUSE

cls

REM Compilation de Taxonomie.java

javac -cp . Taxonomie.java

echo Creation de Taxonomie.class terminee

PAUSE

REM Execution du programme et inscription des résultats dans un fichier texte

REM Execution du programme Taxonomie.class dans le répertoire courant

java -cp . Taxonomie > resultats.txt

cls

echo ############################################################################
echo # fin de l'execution du fichier batch et creation du fichier resultats.txt #
echo # dans le repertoire courant                                               #
echo ############################################################################

PAUSE
