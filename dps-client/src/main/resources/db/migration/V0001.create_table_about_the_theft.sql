
CREATE TABLE IF NOT EXISTS theft_info
(
    id              INT8 PRIMARY KEY not null,
    car_numb        VARCHAR(255),
    brend            VARCHAR(255),
    model           VARCHAR(255),
    fio_initiator    VARCHAR(255),
    date_of_theft    DATE,
    date_of_found    DATE
    );

INSERT INTO test_client (id, car_numb , brend,model,fio_initiator,date_of_theft,date_of_found)
VALUES ( 1,'T345TC','toyota','corolla', 'vadim babich','2020-05-04 00:00:00','2021-12-05'),
       (2, 'X333CC','toyota','camry', 'igor vanchev','2022-07-09 00:00:00','2022-10-15'),
       (3, 'M565MC','chery','tiggo', 'ivan sheglov','2010-12-09 00:00:00','2021-01-11'),
       (4,'X347TX','nissan','almera', 'nikita redkin','2021-09-28 00:00:00','2021-12-15')

create sequence theft_info_sequence;