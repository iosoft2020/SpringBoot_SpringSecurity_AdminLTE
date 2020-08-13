# SpringBoot_SpringSecurity_AdminLTE
-----------------set env start-----------------<br>
・vagrant download<br>
https://www.vagrantup.com/downloads.html<br>

・VirtualBox download<br>
https://www.virtualbox.org/wiki/Downloads<br>

・vagrant install&start centos7 command<br>
vagrant init centos/7<br>
vagrant up<br>

・vagrant ssh command<br>
vagrant ssh<br>

・centos7 install docker<br>
yum remove docker docker-common docker-selinux docker-engine<br>
yum install -y yum-utils device-mapper-persistent-data lvm2<br>
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo<br>
yum makecache fast<br>
yum install docker-ce-17.06.0.ce-1.el7.centos<br>
sudo systemctl start docker<br>

・docker install mysql5.7<br>
docker pull mysql:5.7<br>
docker run -p 3306:3306 --name mysql \
-v /mydata/mysql/log:/var/log/mysql \
-v /mydata/mysql/data:/var/lib/mysql \
-v /mydata/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=root \
-d mysql:5.7<br>
-----------------set env end-----------------<br>

-----------------project html-----------------
![alt tag](http://url/to/img.png)
