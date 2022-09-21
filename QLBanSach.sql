create database QLBANSACH;
use QLBANSACH;

create table khachhang
(
makh int auto_increment,
taikhoan nvarchar(150) unique,
matkhau nvarchar(20) not null,
email varchar(255) not null,
diachi nvarchar(255) not null,
phone nvarchar(12) not null,
gioitinh char(3) not null,
ngaysinh date not null,
hoten nvarchar(150) not null,

primary key(makh)
);

create table donhang(
madonhang int auto_increment primary key,
dathanhtoan double not null,
ngaydat date not null,
ngaygiao date not null ,
check(Ngaygiao >= Ngaydat),
tinhtranggiaohang varchar(20) not null,
makh int,
foreign key(makh) references khachhang(makh)
);

create table chude(
machude int auto_increment,
tenchude nvarchar(255) not null,

primary key(machude)
);

create table sach(
masach int auto_increment,
tensach nvarchar(255) not null,
soluongton int default 0,
ngaycapnhat date not null,
anhbia nvarchar(1000) not null,
mota nvarchar(255) not null,
giaban double not null,
machude int,

primary key (masach),
foreign key(machude) references chude(machude)
);

create table donhang_sach(
madonhang int,
foreign key(madonhang) references donhang(madonhang),
masach int,
foreign key(masach) references sach(masach),
soluong int,
check(soluong > 0),
dongia double not null,

primary key(madonhang,masach)
);

create table tacgia(
matacgia int auto_increment,
tentacgia nvarchar(255) not null,
dienthoai nchar(12) not null,
tieusu nvarchar(255) not null,
diachi nvarchar(255) not null,

primary key (matacgia)
);

create table sach_tacgia(
masach int,
foreign key(masach) references sach(masach),
matacgia int,
foreign key(matacgia) references tacgia(matacgia),
vaitro nvarchar(150) not null,
vitri nvarchar(150) not null,

primary key(masach, matacgia)
);

create table nhaxuatban(
mansx int auto_increment primary key,
tennxb nvarchar(255) not null,
dienthoai nchar(12) not null,
diachi nvarchar(255) not null,
masach int,

foreign key(masach) references sach(masach)
)


