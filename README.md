[Português Brasileiro](https://github.com/Gilberto-Mascena/screanmatch-frases-api/blob/main/README.md) | 
[English](https://github.com/Gilberto-Mascena/screanmatch-frases-api/blob/main/README-en.md)

# Desafio formação backend Java e Spring Boot Alura + ONE

## Descrição do Projeto

- Desenvolver uma API que retorne um json, com uma frase aleatória do banco de dados com: frase, personagem e poster.
- Deve responder no endpoint: "/series/frases" do controller.

## Tecnologias Adotadas
- [Java 21](https://www.oracle.com/br/java/technologies/downloads/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](https://hibernate.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Maven](https://maven.apache.org/)

## Requisitos
- [Java 21](https://www.oracle.com/br/java/technologies/downloads/)
- [PostgreSQL](https://www.postgresql.org/)
- [Postman](https://www.postman.com/)

## Como rodar a aplicação
- Clone o repositório
- Crie um banco de dados no PostgreSQL
- Abra o projeto em sua IDE
- Configure o arquivo application-dev.yml com as informações do seu banco de dados
- Execute a aplicação
- Utilize o Postman para testar a aplicação
- Acesse o endpoint: http://localhost:8080/series/frases

## Scripts SQL para popular a base de dados
````
insert into frases(id, frase, personagem, titulo, poster) values (1, 'Amigos não mentem', 'Eleven', 'Stranger things', 'https://m.media-amazon.com/images/M/MV5BMDZkYmVhNjMtNWU4MC00MDQxLWE3MjYtZGMzZWI1ZjhlOWJmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (2, 'Bem-vinda ao mundo real. É uma droga. Você vai amar', 'Monica', 'Friends', 'https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (3, 'Não é uma mentira se você acreditar nela', 'George Contanza', 'Seinfeld', 'https://m.media-amazon.com/images/M/MV5BZjZjMzQ2ZmUtZWEyZC00NWJiLWFjM2UtMzhmYzZmZDcxMzllXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (4, 'Somos apenas pessoas. Nós erramos, perdemos o rumo. Até os melhores têm os seus dias ruins. Mesmo assim seguimos em frente', 'Meredith Grey', 'Grey''s Anatomy', 'https://m.media-amazon.com/images/M/MV5BODA2Mjk0N2MtNGY0Mi00ZWFjLTkxODEtZDFjNDg4ZDliMGVmXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (5, 'Eu não estou em perigo, eu sou o perigo', 'Walter White', 'Breaking Bad', 'https://m.media-amazon.com/images/M/MV5BYTU3NWI5OGMtZmZhNy00MjVmLTk1YzAtZjA3ZDA3NzcyNDUxXkEyXkFqcGdeQXVyODY5Njk4Njc@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (6, 'Não importa o que você faça na vida. Não vai ser lendário, a menos que os seus amigos estejam lá para ver', 'Barney', 'How I met your Mother', 'https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (7, 'Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.', 'Rocky Balboa', 'Rocky', 'https://m.media-amazon.com/images/M/MV5BNWIyNmQyNjctYmVmMS00MGI4LWIxMmUtNjA0ODYzOTA0Yjk0L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (8, 'Que a força esteja com você!', 'Obi Wan Kenobi', 'Star Wars', 'https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (9, 'Você me salvou de todas as maneiras que alguém pode ser salvo.', 'Rose Dawson', 'Titanic', 'https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (10, 'Você me deu uma eternidade dentro dos nossos dias numerados, e sou muito grata por isso.', 'Hazel', 'A culpa é das estrelas', 'https://m.media-amazon.com/images/M/MV5BNTVkMTFiZWItOTFkOC00YTc3LWFhYzQtZTg3NzAxZjJlNTAyXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (11, 'O inverno está chegando.', 'Ned Stark', 'Game of Thrones', 'https://m.media-amazon.com/images/M/MV5BMzY4NmU4NjgtNDRmZC00Yjk5LTlhOTUtN2I0NzJlZWRlNmFiXkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (12, 'Eu sou o Batman.', 'Bruce Wayne', 'The Dark Knight', 'https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0OF5BMl5BanBnXkFtZTcwNTU3NTEzMw@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (13, 'Por Asgard!', 'Thor', 'Thor', 'https://m.media-amazon.com/images/M/MV5BMjI0OTc3ODkwN15BMl5BanBnXkFtZTcwNjk1NTU1NQ@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (14, 'Com grandes poderes vêm grandes responsabilidades.', 'Tio Ben', 'Homem-Aranha', 'https://m.media-amazon.com/images/M/MV5BM2FhMmYyZDAtMWJmYS00MzBhLTkyN2YtYmU2YjQzNjNiOWRmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (15, 'Dobby é um elfo livre!', 'Dobby', 'Harry Potter', 'https://m.media-amazon.com/images/M/MV5BMTA3MzMxNjc2ODJeQTJeQWpwZ15BbWU3MDA2MTMwNzM@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (16, 'Hakuna Matata! Isso significa sem preocupações.', 'Timon e Pumba', 'O Rei Leão', 'https://m.media-amazon.com/images/M/MV5BMTY5MDY3NDkyMl5BMl5BanBnXkFtZTgwMjM2NzE4MzE@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (17, 'Às vezes, as melhores coisas vêm das escolhas erradas.', 'Ted Mosby', 'How I Met Your Mother', 'https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (18, 'Nunca deixe que lhe digam que não pode fazer algo.', 'Chris Gardner', 'À Procura da Felicidade', 'https://m.media-amazon.com/images/M/MV5BMTczNTI4MzE2NV5BMl5BanBnXkFtZTcwMDQ3NDEzMw@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (19, 'Eu sou o maior que já existiu!', 'Muhammad Ali', 'Ali', 'https://m.media-amazon.com/images/M/MV5BMTk1NzU3NDk0OF5BMl5BanBnXkFtZTcwNzk4NTkxMw@@._V1_SX300.jpg');
insert into frases(id, frase, personagem, titulo, poster) values (20, 'A felicidade só é real quando compartilhada.', 'Christopher McCandless', 'Into the Wild', 'https://m.media-amazon.com/images/M/MV5BMjEzMjQyMDU4M15BMl5BanBnXkFtZTcwMzk2OTM2MQ@@._V1_SX300.jpg');

````

---

## *Licença*

[*Licença MIT*](LICENSE.md) (*MIT*)

### Gilberto | Dev _2024_ 