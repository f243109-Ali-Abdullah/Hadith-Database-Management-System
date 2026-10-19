DROP DATABASE IF EXISTS hadith_db;

CREATE DATABASE hadith_db CHARACTER SET utf8mb4;
USE hadith_db;

CREATE TABLE hadith_collections (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  compiler VARCHAR(255),
  description TEXT,
  edition VARCHAR(255),
  publication_details TEXT
);

CREATE TABLE books (
  id INT AUTO_INCREMENT PRIMARY KEY,
  collection_id INT NOT NULL,
  book_number INT NOT NULL,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  UNIQUE (collection_id, book_number),
  FOREIGN KEY (collection_id) REFERENCES hadith_collections(id) ON DELETE CASCADE
);

CREATE TABLE chapters (
  id INT AUTO_INCREMENT PRIMARY KEY,
  book_id INT NOT NULL,
  chapter_number INT NOT NULL,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  UNIQUE (book_id, chapter_number),
  FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
);

CREATE TABLE hadiths (
  id INT AUTO_INCREMENT PRIMARY KEY,
  chapter_id INT NOT NULL,
  hadith_number VARCHAR(50) NOT NULL,
  arabic_text TEXT NOT NULL,
  source_reference VARCHAR(500) NOT NULL,
  isnad TEXT,
  matn TEXT,
  notes TEXT,
  UNIQUE (chapter_id, hadith_number),
  FOREIGN KEY (chapter_id) REFERENCES chapters(id) ON DELETE CASCADE
);

CREATE TABLE translations (
  id INT AUTO_INCREMENT PRIMARY KEY,
  hadith_id INT NOT NULL,
  language VARCHAR(100) NOT NULL,
  translated_text TEXT NOT NULL,
  translator VARCHAR(255),
  UNIQUE (hadith_id, language),
  FOREIGN KEY (hadith_id) REFERENCES hadiths(id) ON DELETE CASCADE
);

-- A glossary entry belongs to a book OR a chapter, so one of the two stays empty (NULL)
CREATE TABLE glossary_entries (
  id INT AUTO_INCREMENT PRIMARY KEY,
  book_id INT,
  chapter_id INT,
  arabic_term VARCHAR(255) NOT NULL,
  urdu_meaning TEXT NOT NULL,
  urdu_explanation TEXT,
  FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE,
  FOREIGN KEY (chapter_id) REFERENCES chapters(id) ON DELETE CASCADE
);