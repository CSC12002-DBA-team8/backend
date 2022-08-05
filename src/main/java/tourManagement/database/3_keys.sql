--fk
alter table TOUR
    add constraint fk_TOUR_DiemKH
        foreign key(DiemKH)
            references DIADIEM(MaDD);
alter table QLTOUR
    add constraint fk_QLTOUR_MaTour
        foreign key(MaTour)
            references TOUR(MaTour);
alter table QLTOUR
    add constraint fk_QLTOUR_MaHDV
        foreign key(MaHDV)
            references HDV(MaHDV);
alter table DIEMDEN
    add constraint fk_DIEMDEN_MaTour
        foreign key(MaTour)
            references TOUR(MaTour);
alter table DIEMDEN
    add constraint fk_DIEMDEN_MaDD
        foreign key(MaDD)
            references DIADIEM(MaDD);
alter table MOTA
    add constraint fk_MOTA_MaTour
        foreign key(MaTour)
            references TOUR(MaTour);
alter table CHUYENDI
    add constraint fk_CHUYENDI_MaHDV
        foreign key(MaHDV)
            references HDV(MaHDV);
alter table CHUYENDI
    add constraint fk_CHUYENDI_MaTour
        foreign key(MaTour)
            references TOUR(MaTour);
alter table GIAODICH
    add constraint fk_GIAODICH_CCCDKH
        foreign key(CCCDKH)
            references KHACHHANG(CCCD);
alter table GIAODICH
    add constraint fk_GIAODICH_MaCD
        foreign key(MaCD)
            references CHUYENDI(MaCD);
go
