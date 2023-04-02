# Java Servlets and JSP - Build Java EE by in28Minutes
![](https://img.shields.io/badge/status-completed-brightgreen)

<p align="center">
<img src=".github/logo.png">
</p>

Learn Java EE - Java Servlets and JSP with a Hands-on Step by Step Approach building a Todo Management Application! From [Udemy](https://www.udemy.com/course/learn-java-servlets-and-jsp-web-application-in-25-steps/).

Creator: Ranga Karanam

## History of commands

```bash
# Install openJDK 17 globally
sudo apt install openjdk-17-jdk

# Add JAVA_HOME
echo 'export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64/"' | \
sudo tee /etc/profile.d/jdk.sh

# Download Eclipse Installer from
# https://www.eclipse.org/downloads/packages/installer
# Extract package
tar -zxf eclipse-inst-jre-linux64.tar.gz

# Eclipse IDE for Enterprise Java and Web Developers
# Installation Folder: ~/.apps

# Fix Launcher
sed -i "/Categories=/c\Categories=Development;IDE;" \
~/.local/share/applications/epp.package.jee.desktop

# Download Tomcat 10 from
# https://tomcat.apache.org/download-10.cgi
# Extract package
tar -zxf apache-tomcat-10.1.7.tar.gz -C ~/.apps

# Added Tomcat server to Eclipse in
# ~/.apps/apache-tomcat-10.1.7/

# Installed Lombok plugin on Eclipse from:
# https://projectlombok.org/setup/eclipse

```