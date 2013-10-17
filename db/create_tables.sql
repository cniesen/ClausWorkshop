CREATE TABLE cw_request_t
(
    id BIGINT NOT NULL,
    date DATE NOT NULL,
    beneficiary VARCHAR(50) NOT NULL,
    description VARCHAR(250) NOT NULL,
    obj_id VARCHAR(36) NOT NULL,
    ver_nbr DECIMAL(8) NOT NULL DEFAULT 1,
    PRIMARY KEY(id),
    UNIQUE cw_request_tc0(obj_id)
);

CREATE TABLE cw_request_s
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id)
);