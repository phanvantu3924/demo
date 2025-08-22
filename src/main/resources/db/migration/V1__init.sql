CREATE TABLE IF NOT EXISTS notes (
    id INT PRIMARY KEY,
    content VARCHAR(200) NOT NULL
);

-- dữ liệu mẫu
INSERT INTO notes (id, content) VALUES (1, 'Hello from Flyway!') ON CONFLICT DO NOTHING;
