INSERT INTO tb_user_app (name,email) VALUES ('person1', 'person1@mail.com');
INSERT INTO tb_user_app (name,email) VALUES ('person2', 'person2@mail.com');
INSERT INTO tb_user_app (name,email) VALUES ('person3', 'person3@mail.com');
INSERT INTO tb_user_app (name,email) VALUES ('person4', 'person4@mail.com');

INSERT INTO tb_local(local, equipement) VALUES (1, 'Luz  piscar');
INSERT INTO tb_local(local, equipement) VALUES (2, 'Trocar puxadores');
INSERT INTO tb_local(local, equipement) VALUES (2, 'Arrumar mesa');
INSERT INTO tb_local(local, equipement) VALUES (4, 'Trocar lâmpada');


INSERT INTO tb_addressed (name, email) VALUES (1, 'Thiago Rabaioli');
INSERT INTO tb_addressed (name, email) VALUES (2, 'Catarina Almeida');

INSERT INTO tb_occurrence (occurrence_name, data_open_occurrence, data_close_occurrence, state, priority, img, user_app_id, local_id, addressed_id) VALUES ('Luz forno avariada lado direito', TIMESTAMP WITH TIME ZONE '2022-08-25T13:00:00Z', TIMESTAMP WITH TIME ZONE '2022-07-26T13:00:00Z',1, 3, 'htttp://...', 2,1,1);
INSERT INTO tb_occurrence (occurrence_name, data_open_occurrence, data_close_occurrence, state, priority, img, user_app_id,local_id, addressed_id) VALUES ('puxador cozinha', TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', TIMESTAMP WITH TIME ZONE '2023-07-26T13:00:00Z',2, 1, 'htttp://...', 2,2,1);
INSERT INTO tb_occurrence (occurrence_name, data_open_occurrence, data_close_occurrence, state, priority, img, user_app_id,local_id, addressed_id) VALUES ('Pneu Smart', TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', TIMESTAMP WITH TIME ZONE '2022-07-12T13:00:00Z',3, 2, 'htttp://...', 3,2,2);
INSERT INTO tb_occurrence (occurrence_name, data_open_occurrence, data_close_occurrence, state, priority, img, user_app_id,local_id, addressed_id) VALUES ('Cadeira Gaming', TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', TIMESTAMP WITH TIME ZONE '2022-12-26T13:00:00Z',2, 2, 'htttp://...', 1,3,2);
INSERT INTO tb_occurrence (occurrence_name, data_open_occurrence, data_close_occurrence, state, priority, img, user_app_id,local_id, addressed_id) VALUES ('Campainha casa', TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', TIMESTAMP WITH TIME ZONE '2022-07-26T13:00:00Z',1, 1, 'htttp://...', 2,1,2);

