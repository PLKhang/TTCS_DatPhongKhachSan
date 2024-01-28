create table KIEUPHONG(
	MaKP varchar(10) not null,
	TenKP nvarchar(50) not null unique,
	DienTich nvarchar(10) not null,
	GhiChuKP text default ' ',
	primary key(MaKP),
);

create table LOAIPHONG(
	MaLP varchar(10) not null,
	TenLP nvarchar(50) not null unique,
	GhiChuLP text default ' ',
	primary key(MaLP),
);

create table HANGPHONG(
	MaHP varchar(10) not null,
	TenHP nvarchar(50) not null unique,
	MaKP varchar(10) not null,
	MaLP varchar(10) not null,
	primary key(MaHP),
	foreign key(MaKP) references KIEUPHONG(MaKP) on update cascade,
	foreign key(MaLP) references LOAIPHONG(MaLP) on update cascade
);

create table PHONG(
	MaPhong varchar(10) not null,
	MaHP varchar(10) not null,
	SoPhong tinyint not null,
	SoTang tinyint not null,
	TrangThaiP nvarchar(15) not null,
	check (TrangThaiP in (N'Sẵn sàng',N'Đang thuê',N'Sửa',N'Dơ')),
	primary key(MaPhong),
	foreign key(MaHp) references HANGPHONG(MaHP) on update cascade
);

create table KHACHHANG(
	CCCD char(20) not null,
	HO nvarchar(50) not null,
	TEN nvarchar(10) not null,
	PHAI nvarchar(3) default 'NAM',
	check (PHAI in (N'NAM',N'NỮ')),
	SDT varchar(15) not null,
	Email varchar(50) not null,
	NgaySinh date not null,
	DiaChi nvarchar(50) default ' ',
	MST varchar(20) not null unique,
	primary key(CCCD)
);

create table TAIKHOAN(
	UserName varchar(30) not null,
	primary key (UserName),
	PassWordTK varchar(50) not null,
	CCCD char(20) not null,
	foreign key(CCCD) references KHACHHANG(CCCD) on update cascade,
	SoDuTK int 
);

create table PHIEUDAT(
	MaPD varchar(10) not null,
	primary key(MaPD),
	UserName varchar(30) not null,
	foreign key(UserName) references TAIKHOAN(UserName) on update cascade,
	NgayDat date not null,
	NgayBD date not null,
	SoNgay int default 1,
	check (SoNgay >=1),
	TrangThaiPD nvarchar(15) not null,
	check (TrangThaiPD in (N'Đang đặt', N'Đã check in', N'Đã check out',N'Đã hủy'))
);

create table CTPD(
	MaPD varchar(10) not null,
	MaHP varchar(10) not null,
	SoLuong int default 1,
	check (SoLuong >=1),
	foreign key(MaHP) references HANGPHONG(MaHP) on update cascade,
	foreign key(MaPD) references PHIEUDAT(MaPD) on update cascade,
	primary key(MaPD,MaHP)
);