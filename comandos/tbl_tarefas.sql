CREATE TABLE tarefas(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(60),
    descricao VARCHAR(255),
    local VARCHAR(255),
    dataCriacao DATE,
    dataInicio DATE,
    dataFim DATE
);
