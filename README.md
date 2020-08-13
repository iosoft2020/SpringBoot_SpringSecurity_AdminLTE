# SpringBoot_SpringSecurity_AdminLTE
<h1>technology stacks</h1><br>
<ul>
<li>Springboot</li>
<li>SpringSecurity</li>
<li>AdminLTE3</li>
<li>Java11</li>
<li>MyBatis</li>
<li>Thymeleaf</li>
</ul>

<h1>set env</h1><br>
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

<h1>project html</h1><br>
<img src="https://github.com/iosoft2020/SpringBoot_SpringSecurity_AdminLTE/blob/master/images/login.png" alt="login" title="login">
<img src="https://github.com/iosoft2020/SpringBoot_SpringSecurity_AdminLTE/blob/master/images/index.png" alt="index" title="index">
<img src="https://github.com/iosoft2020/SpringBoot_SpringSecurity_AdminLTE/blob/master/images/Employees.png" alt="Employees" title="Employees">
<img src="https://github.com/iosoft2020/SpringBoot_SpringSecurity_AdminLTE/blob/master/images/AddEmployee.png" alt="AddEmployee" title="AddEmployee">
<img src="https://github.com/iosoft2020/SpringBoot_SpringSecurity_AdminLTE/blob/master/images/EditEmployee.png" alt="EditEmployee" title="EditEmployee">
