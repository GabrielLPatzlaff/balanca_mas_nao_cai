# Models do projeto Balança mas não cai

Copie a pasta src/model para Source Packages do seu projeto no NetBeans,
ou abra este projeto com Arquivo > Abrir Projeto. As telas e a conexão foram preservadas.

Cada classe representa uma tabela do Dump20261118.sql, com atributos privados,
construtor vazio, construtor completo, getters e setters.

| Tabela | Classe |
| --- | --- |
| engenheiros | model.Engenheiro |
| fases | model.Fase |
| funcoes | model.Funcao |
| obras | model.Obra |
| obras_engenheiros | model.ObraEngenheiro |
| obras_fases | model.ObraFase |
| orcamentos | model.Orcamento |
| orcamentos_obras | model.OrcamentoObra |
| usuarios | model.Usuario |

## Tipos e nomes

- INT: int. IDs ainda não gravados podem permanecer com o valor 0.
- VARCHAR: String.
- DATE: java.sql.Date; pode ser null nos campos opcionais.
- DECIMAL(10,2): java.math.BigDecimal para preservar os centavos.
- As colunas Nome, Email, Senha e Descricao usam atributos nome, email, senha e descricao.
- Os demais nomes seguem o dump, inclusive dtDdmissaoEngenheiro em Obra e dtIniciofase em ObraFase.
- As classes de associação mantêm os dois IDs que formam a chave primária.

O ZIP PHP possui telas para engenheiros, fases, funções e usuários. Os cinco
models restantes representam as demais tabelas do dump.

O model representa os dados em Java. Consultas SQL e gravações pertencem ao DAO;
nenhuma chamada às telas foi adicionada nesta etapa. A senha do MySQL é configurada localmente, conforme o README,
e é diferente do atributo senha de model.Usuario.

Para converter a data digitada no formato yyyy-MM-dd:

```java
engenheiro.setDtAdmissao(java.sql.Date.valueOf("2026-11-18"));
```

Observação para uma futura conversão do login: o PHP gera hash de senha, enquanto
o dump atual define usuarios.Senha como varchar(12). O model mantém String;
o armazenamento e a autenticação precisarão ser compatibilizados na etapa do DAO.
