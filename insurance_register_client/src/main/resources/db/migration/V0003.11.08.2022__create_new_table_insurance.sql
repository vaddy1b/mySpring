CREATE TABLE IF NOT EXISTS insurance
(
    id           INT8 PRIMARY KEY not null,
    vin_code     VARCHAR(255),
    start_date   DATE,
    end_date     DATE
    );
create sequence insurance_sequence;
