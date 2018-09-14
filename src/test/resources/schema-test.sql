CREATE TABLE IF NOT EXISTS brazilian(
    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    login_username VARCHAR(32) UNIQUE NOT NULL,
    password_hash CHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS brazil(
    id SERIAL NOT NULL PRIMARY KEY,
    string_id VARCHAR(32) UNIQUE NOT NULL,
    name VARCHAR(32) NOT NULL,
    password_hash CHAR(60) NOT NULL
);

CREATE TABLE IF NOT EXISTS yurubo(
    id SERIAL NOT NULL PRIMARY KEY,
    game VARCHAR(16),
    title VARCHAR(128) NOT NULL,
    settled_on TIMESTAMP WITH TIME ZONE NOT NULL,
    max_member INTEGER NOT NULL,
    memo VARCHAR(1024),
    host_id INTEGER NOT NULL REFERENCES brazilian(id),
    brazil_id INTEGER NOT NULL REFERENCES brazil(id)
);

CREATE TABLE IF NOT EXISTS participation(
    yurubo_id INTEGER NOT NULL REFERENCES yurubo(id),
    brazilian_id INTEGER NOT NULL REFERENCES brazilian(id)
);

CREATE TABLE IF NOT EXISTS membership(
    brazilian_id INTEGER NOT NULL REFERENCES brazilian(id),
    brazil_id INTEGER NOT NULL REFERENCES brazil(id)
);