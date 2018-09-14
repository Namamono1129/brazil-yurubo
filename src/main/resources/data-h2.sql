INSERT INTO brazilian(id, name, login_username, password_hash) VALUES(
1,
'pori',
'pori',
'$2a$08$urnSw5ow48PWO9xJ/KBDmO23yRFF6zhWuFqJfmQdkBLUlmJsGk3hW'
),
(
2,
'namamono',
'namamono',
'$2a$08$zQ7uwLFC.eY.aG4NthI3yePbBJc.4xZKwUDoQc7KvZ1RvHRVC0r/S'
);

INSERT INTO brazil(id, string_id, name, password_hash) VALUES
(
    1,
    'brazil',
    'ブラジル',
    '$2a$08$SiR.5SoVyb5pI0Ft1j4eB.FtK/sLub61iLOS9SdmjwSHAI6mg.DL2'
),
(
    2,
    'no',
    'n-only',
    '$2a$08$SiR.5SoVyb5pI0Ft1j4eB.FtK/sLub61iLOS9SdmjwSHAI6mg.DL2'
);

INSERT INTO yurubo(id, game, title, settled_on, max_member, memo, host_id, brazil_id) VALUES(
      1,
      'L4D2',
      'やるぞ',
      '2018-09-12 19:00:00',
      4,
      'とくになし',
      1,
      1
);

INSERT INTO participation(yurubo_id, brazilian_id) VALUES
(1, 1),
(1, 2);

INSERT INTO membership(brazilian_id, brazil_id) VALUES
(1, 1),
(2, 1),
(2, 2);