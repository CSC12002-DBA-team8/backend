create database QuanLyTourDuLich;
go
use QuanLyTourDuLich;
go

create table NHANVIEN (
                          MaNV int,
                          CCCD char(15) unique,
                          Hoten nvarchar(30),
                          SDT char(12),
                          Diachi nvarchar(50),
                          Birthday date,
                          Passwrd varchar(50),
                          Email varchar(20) unique,
                          Primary key(MaNV)
);

create table KHACHHANG(
                          CCCD int,
                          Hoten nvarchar(30),
                          SDT char(12),
                          Diachi nvarchar(50),
                          Birthday date,
                          Email varchar(20) unique,
                          Primary key(CCCD)
);

create table HDV (
                     MaHDV int,
                     CCCD char(15) unique,
                     Hoten nvarchar(30),
                     SDT char(12),
                     Diachi nvarchar(50),
                     Birthday date,
                     Email varchar(20) unique,
                     Primary key(MaHDV)
);

create table DIADIEM(
                        MaDD int,
                        Country nvarchar(30),
                        City nvarchar(30),
                        Primary key(MaDD)
);
go

create table TOUR(
                     MaTour int,
                     TenTour nvarchar(50),
                     ThoiLuong INT,
                     SoNguoiToiDa int,
                     GiaVe int,
                     GiaVeTE int,
                     DiemKH int, --diem khoi hanh
                     TinhTrang int,
                     Primary key(MaTour)
);
go

create table QLTOUR(
                       MaQuanLyTour int,
                       MaTour int,
                       MaHDV int,
                       Primary key(MaQuanLyTour)
);

create table DIEMDEN(
                        MaDiemDen int,
                        MaTour int,
                        MaDD int,
                        Primary key(MaDiemDen)
);

create table MOTA(
                     MaMoTa int,
                     MaTour int,
                     STT int,
                     Picture varchar(1000), --duong dan toi hinh anh
                     Descript nvarchar(2000),
                     Primary key(MaMoTa)
);

create table CHUYENDI(
                         MaCD int,
                         NgayKhoiHanh date,
                         SoGheTrong int,
                         MaHDV int,
                         MaTour int,
                         Primary key(MaCD)
);

create table GIAODICH(
                         MaGD int,
                         NgayGD date,
                         SoVe int,
                         SoVeTE int,
                         TongTien int,
                         Note nvarchar(500) null,
                         CCCDKH int,
                         MaCD int,
                         Primary key(MaGD)
);
go
