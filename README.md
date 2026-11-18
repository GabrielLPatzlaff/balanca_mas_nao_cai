# Balança mas não cai

Projeto escolar de gestão de obras desenvolvido por Gabriel Patzlaff.
Conversão das telas da aplicação HTML, CSS, JavaScript e PHP para Java Swing no NetBeans.

## Conteúdo

- `src/view`: telas de login, menu, engenheiros, fases, funções e usuários. Os arquivos `.form` permitem editar as telas no editor visual do NetBeans.
- `src/model`: nove classes com atributos, construtores, getters e setters, baseadas nas tabelas do banco.
- `src/dao/Conexao.java`: conexão JDBC com o MySQL e teste de acesso ao banco.
- `banco/estrutura.sql`: estrutura das tabelas do banco `balanca_mas_nao_cai`.
- `nbproject`: configuração do projeto NetBeans com Ant.

Esta etapa contém as telas, os models e a classe de conexão. A autenticação e os comandos de CRUD ainda não estão integrados às telas.

## Como abrir

1. Instale o JDK 21 e abra o NetBeans.
2. Baixe ou clone este repositório.
3. Em **File > Open Project**, selecione a pasta que contém `build.xml` e `nbproject`.
4. Para apresentar as telas, execute `view.TelaLogin` ou abra outra classe de `view` e use **Run File (Shift + F6)**.

## Conexão com o banco

1. Em **Libraries > Add JAR/Folder**, adicione o `mysql-connector-java-8.0.22.jar` usado na aula. O JAR deve ser obtido separadamente.
2. A conexão está configurada para `192.168.20.5:3306`, usuário `root`, banco `balanca_mas_nao_cai`. O computador precisa alcançar esse servidor.
3. Configure a senha localmente em **Project Properties > Run > VM Options**, no formato `-Ddb.password=SUA_SENHA`, ou defina a variável de ambiente `DB_PASSWORD` antes de abrir o NetBeans.
4. Execute `dao.Conexao` com **Shift + F6** para testar.

A senha do MySQL não é armazenada no repositório. Para outro servidor, ajuste URL e usuário em `Conexao.java`.

O script `banco/estrutura.sql` pode ser utilizado para criar uma base nova. Ele contém somente as definições das tabelas, sem os registros e senhas do dump original.

## Models

`Engenheiro`, `Fase`, `Funcao`, `Usuario`, `Obra`, `ObraEngenheiro`, `ObraFase`, `Orcamento` e `OrcamentoObra`.

Datas usam `java.sql.Date`; valores monetários usam `BigDecimal`. Mais detalhes em `LEIA_MODEL.md`.
