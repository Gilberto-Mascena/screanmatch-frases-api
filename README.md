[Português Brasileiro](https://github.com/Gilberto-Mascena/screanmatch-frases-api/blob/main/README.md) | 
[English](https://github.com/Gilberto-Mascena/screanmatch-frases-api/blob/main/README-en.md)

![Status de Manutenção](https://img.shields.io/badge/Maintained-Yes-brightgreen?style=for-the-badge)
[![GitHub Actions Status](https://img.shields.io/github/actions/workflow/status/Gilberto-Mascena/screanmatch-frases-api/build.yml?style=for-the-badge)](https://github.com/Gilberto-Mascena/screanmatch-frases-api/actions)
[![Licença](https://img.shields.io/github/license/Gilberto-Mascena/screanmatch-frases-api?style=for-the-badge)](https://github.com/Gilberto-Mascena/screanmatch-frases-api/blob/main/LICENSE.md)
[![Estrelas no GitHub](https://img.shields.io/github/stars/Gilberto-Mascena/screanmatch-frases-api?style=for-the-badge)](https://github.com/Gilberto-Mascena/screanmatch-frases-api/stargazers)
[![Problemas no GitHub](https://img.shields.io/github/issues/Gilberto-Mascena/screanmatch-frases-api?style=for-the-badge)](https://github.com/Gilberto-Mascena/screanmatch-frases-api/issues)
[![Versão do Repositório](https://img.shields.io/github/v/release/Gilberto-Mascena/screanmatch-frases-api?include_prereleases&style=for-the-badge)](https://github.com/Gilberto-Mascena/screanmatch-frases-api/releases)
![Data de Lançamento](https://img.shields.io/github/release-date/Gilberto-Mascena/screanmatch-frases-api?style=for-the-badge)
![Tamanho do Repositório](https://img.shields.io/github/repo-size/Gilberto-Mascena/screanmatch-frases-api?style=for-the-badge)

# Screanmatch Frases API

## Desafio - Formação Backend Java e Spring Boot (Alura + ONE)

### Sobre o Projeto

#### O Screanmatch Frases API é uma API REST desenvolvida em Java com Spring Boot, que retorna uma frase aleatória de um banco de dados contendo frases icônicas de séries e filmes. A API fornece os seguintes dados:

- **Frase**
- **Personagem**
- **Título da obra**
- **Pôster do filme / série**

### Endpoint Disponível

_*GET /series/frases*_

### Tecnologias Utilizadas
- [Java 21](https://www.oracle.com/br/java/technologies/downloads/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](https://hibernate.org/)
- [H2 Database](https://www.h2database.com/html/main.html) (para testes)
- [PostgreSQL](https://www.postgresql.org/)
- [Maven](https://maven.apache.org/)

### Requisitos
- [Java 21](https://www.oracle.com/br/java/technologies/downloads/)
- [PostgreSQL](https://www.postgresql.org/)
- [Postman](https://www.postman.com/)
- [Maven](https://maven.apache.org/)

### Fron-end da aplicação

![titanic](/src/main/resources/static/titanic.png)

![how i met your mother.png](/src/main/resources/static/how-i-met-your-mother.png)

### Como Executar
1. Clone o repositório
```bash
    git clone https://github.com/Gilberto-Mascena/screanmatch-frases-api.git
    cd screanmatch-frases-api
```
```bash
    mvn clean install
```

```bash
    mvn spring-boot:run
```

2. Acesse o H2 Console
  
    http://localhost:8080/h2-console

   - **JDBC URL**: `jdbc:h2:mem:devdb`
   - **User Name**: `sa`
   - **Password**: *(deixe em branco)*

### Scripts SQL para popular a base de dados
```sql
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

```


3. Teste a API via Postman / Insomnia

   `GET Verbo HTTP`
```
    http://localhost:8080/series/frases
```

4. Navegador\
Acesse: http://localhost:8080/series/frases


### 📜 *Licença*

*Este projeto está licenciado sob a MIT License. Veja mais detalhes em:* [_LICENSE.md_](./LICENSE.md)

### Gilberto | Dev _2024_ 