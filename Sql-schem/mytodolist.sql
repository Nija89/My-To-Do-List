CREATE DATABASE IF NOT EXISTS mytodolist;
USE mytodolist;

-- Create the myList table if it does not exist
CREATE TABLE IF NOT EXISTS myList (
    id INT AUTO_INCREMENT PRIMARY KEY,
    head VARCHAR(255) NOT NULL,
    body TEXT NOT NULL,
    time_created TIMESTAMP
);
