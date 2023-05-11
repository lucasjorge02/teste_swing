#!/bin/bash

echo "Permissão para configurar o ambiente e instalar o aplicativo da ErrorEagle [s/n]"
sleep 2
read get1    #variável que guarda resposta do usuário

if [ "$get1" == "s" ];
then 
    echo "Preparando e atualizando ambiente"
    sleep 2
    sudo apt update && sudo apt upgrade -y

    
else    
    echo "Encerrando sistema!"	     
    sleep 3
    exit 	
fi

    echo "Verificando java na máquina!"
    sleep 2
    java --version

    if [ $? = 0 ]; then #se retorno for igual a 0
        echo "Java instalado, seguiremos com a instalação!"
        sleep 2

    else 
        while true; do
            read -p "Java não instalado, gostaria de instalar o Java? [s/n] " get3    # variável que guarda resposta do usuário
            case $get3 in
                [Ss]* ) 
                    echo "Realizando Instalação do Java"
                    sleep 2
                    sudo apt install openjdk-17-jre -y #executa instalação do java
                    break ;;
                [Nn]* ) 
                    echo "Não foi possível continuar sem o Java."
                    exit ;;
                * ) echo "Por favor, responda [s]im ou [n]ão." ;;
            esac
        done
    fi

 echo "Baixando aplicativo da ErrorEagle"
    sleep 2
    wget https://raw.githubusercontent.com/lucasjorge02/teste_swing/main/tela-swing/target/ErrorEagle.jar
    
    echo "Concluindo Instalação..."	
    echo "Deseja executar o programa da ErrorEagle (s/n)"
    read get4

    if [ "$get4" == "s" ]; then
        echo "Executando aplicação"
        sleep 3	
        chmod +x ErrorEagle.jar
        java -jar /home/ubuntu/Desktop/ErrorEagle.jar     
        
        echo "executando serviço"
        sleep 3
        exit
    else    
        echo "Encerrando sistema!"	     
        sleep 3
        exit

    fi

