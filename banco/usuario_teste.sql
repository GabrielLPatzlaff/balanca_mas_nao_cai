USE balanca_mas_nao_cai;

UPDATE usuarios SET Senha = '12345' WHERE Email = 'teste@gmail.com';
INSERT INTO usuarios (Nome, Email, Senha)
SELECT 'Usuario Teste', 'teste@gmail.com', '12345'
WHERE NOT EXISTS (SELECT 1 FROM usuarios WHERE Email = 'teste@gmail.com');
