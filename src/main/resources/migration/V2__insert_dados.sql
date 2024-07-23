INSERT INTO usuario (nome, email, senha, saldo)
VALUES ('Luiz Philipe', 'philipe@hotmail.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        1000.00),
       ('Pedro da Silva', 'pedro.silva@example.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        1500.00),
       ('Julio da Silva', 'julio.silva@example.com', '$2y$10$nhhwcC/rR8mQwEby41Zxh.1jDqWEhzn0kgO7sKu/0RBQoxiAaBcTS',
        500.00);

INSERT INTO conta (nome, descricao, valor_original, data_vencimento, situacao, data_pagamento, observacao, usuario_id)
VALUES ('Conta de Luz', 'Conta de energia elétrica mensal', 150.75, '2024-08-01', 'PENDENTE', NULL,
        'Pagar até o vencimento', 1),
       ('Conta de Água', 'Conta de água mensal', 80.50, '2024-08-05', 'PENDENTE', NULL, 'Verificar consumo', 1),
       ('Internet', 'Conta de internet mensal', 120.00, '2024-08-10', 'PENDENTE', NULL, 'Plano básico', 2),
       ('Cartão de Crédito', 'Fatura do cartão de crédito', 200.00, '2024-08-15', 'PENDENTE', NULL,
        'Pagar antes do vencimento', 2),
       ('Aluguel', 'Pagamento do aluguel', 800.00, '2024-08-01', 'PENDENTE', NULL, 'Confirmar valor', 3),
       ('Academia', 'Mensalidade da academia', 50.00, '2024-08-03', 'PENDENTE', NULL, 'Pagar todo início do mês', 3);
