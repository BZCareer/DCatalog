#!/bin/sh
VERSION="1.0.0-SNAPSHOT"
AUTHOR="Zak Hassan <zak.hassan@redhat.com>"


cat << 'EOF'
     ____     _________  _________    __    ____  ______
    / __ \   / ____/   |/_  __/   |  / /   / __ \/ ____/
   / / / /  / /   / /| | / / / /| | / /   / / / / / __
  / /_/ /  / /___/ ___ |/ / / ___ |/ /___/ /_/ / /_/ /
 /_____/   \____/_/  |_/_/ /_/  |_/_____/\____/\____/

EOF

#mvn clean install;

while true; do
    read -p "Would you like to build dcatalog-core ? " yn
    case $yn in
        [Yy]* ) docker   build   -t  zmhassan/dcatalog-core ./datacatalog-core/; break;;
        [Nn]* ) exit;;
        * ) echo "Please answer yes or no.";;
    esac
done
