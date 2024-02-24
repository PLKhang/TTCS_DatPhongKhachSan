create database DatPhongKhachSan
go

use DatPhongKhachSan
go

create table KIEUPHONG(
	MAKP char(10),
	TENKP nvarchar(50) not null unique,
	WIFI bit default 0,
	DIENTICH float not null check (DIENTICH > 0),
	VIEWP text default '',
	MOTA text default '',
	primary key(MAKP)
)
go

create table LOAIPHONG(
	MALP char(10),
	TENLP nvarchar(50) not null unique,
	MOTA text default '',
	primary key(MALP)
)
go

create table HANGPHONG(
	MAHP char(10),
	TENHP nvarchar(50) not null unique,
	MAKP char(10) not null,
	MALP char(10) not null,
	DONGIA money not null check (DONGIA >= 0),
	SONGUOI tinyint not null check (SONGUOI >= 1),
	primary key(MAHP),
	foreign key(MAKP) references KIEUPHONG(MAKP) on update cascade,
	foreign key(MALP) references LOAIPHONG(MALP) on update cascade
)
go

create table PHONG(
	MAPHONG char(10),
	MAHP char(10) not null,
	SOPHONG tinyint not null check (SOPHONG >= 0),
	SOTANG tinyint not null check (SOTANG >= 0),
	TRANGTHAI nvarchar(15) not null check (TRANGTHAI in (N'Sẵn sàng', N'Bẩn', N'Sửa chữa', N'Bận')),
	primary key(MAPHONG),
	foreign key(MAHP) references HANGPHONG(MAHP) on update cascade
)
go

create table KHACHHANG(
	CCCD char(20),
	HO nvarchar(50) not null,
	TEN nvarchar(10) not null,
	PHAI bit default 0,
	SDT varchar(15) not null,
	EMAIL varchar(100) not null,
	NGAYSINH date not null,
	DIACHI text default '',
	MST varchar(20) not null unique,
	primary key(CCCD)
)
go

create table TAIKHOAN(
	USERNAME char(30),
	USERPW varchar(50) not null,
	CCCD char(20) not null unique,
	primary key (USERNAME),
	foreign key(CCCD) references KHACHHANG(CCCD) on update cascade
)
go

create table PHIEUDAT(
	MAPD char(10),
	USERNAME char(30) not null,
	NGAYDAT date not null,
	NGAYBD date not null,
	SONGAY int default 1 check (SONGAY >= 1),
	TRANGTHAI nvarchar(15) not null check (TRANGTHAI in (N'Đang đặt', N'Đã check in', N'Đã check out', N'Đã hủy')),
	primary key(MAPD),
	foreign key(USERNAME) references TAIKHOAN(USERNAME) on update cascade
)
go

create table CT_PHIEUDAT(
	MAPD char(10) not null,
	MAHP char(10) not null,
	SOLUONG tinyint default 1 check (SOLUONG >= 1),
	primary key(MAPD, MAHP),
	foreign key(MAPD) references PHIEUDAT(MAPD) on update cascade,
	foreign key(MAHP) references HANGPHONG(MAHP) on update cascade
)
go

