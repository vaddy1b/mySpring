
    CREATE TABLE IF NOT EXISTS test_client
    (
        id           INT8 PRIMARY KEY not null,
        insurance_numb  INT8,
        name_user    VARCHAR(255)
        );
    create sequence test_client_sequence;