DROP table Concert if exists;
CREATE TABLE Concert (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    artist VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    availableTickets INT NOT NULL
);