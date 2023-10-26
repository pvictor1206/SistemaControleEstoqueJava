# Sistema de Controle de Estoque em Java

Elaboração de um diagrama entidade-relacionamento (DER) para ilustrar as
entidades, atributos e relacionamentos envolvidos no domínio acadêmico. Requisitos de dados:
I. As unidades acadêmicas são compostas por departamentos, que por sua vez, 
apresentam cursos. Por exemplo, na UFC, o Centro de Ciências (unidade 
acadêmica) é composto por vários departamentos, entre eles o DC, que oferta o
curso de Ciência da Computação.
II. Um curso pode pertencer a mais de um departamento. Por exemplo, na UFC, o 
curso de Engenharia da Computação pertence aos departamentos DC e DETI.
III. Cada unidade acadêmica possui um código, nome, endereço, um diretor (um 
professor) e vários números de telefones. Cada Departamento possui um código, 
nome, endereço, um chefe (professor) e vários telefones. Por sua vez, um curso 
possui um código, nome, endereço, um coordenador (professor).
IV. Cada curso oferta várias disciplinas. Cada disciplina possui um código, um nome, 
e quantidade de créditos. Uma disciplina pode apresentar vários pré-requisitos 
(disciplinas). Uma disciplina é ministrada por um ou mais professores, em um 
dado semestre.
V. Uma mesma disciplina pode ser ofertada em mais de um curso. Por exemplo, a 
disciplina de FBD é ofertada para os cursos de Ciência da Computação e 
Engenharia da Computação.
VI. Os professores estão lotados em departamentos. Nenhum professor pode estar 
lotado em mais de um departamento. Cada professor possui uma matrícula, 
nome, CPF, RG, salário, endereço. Os atributos matrícula, CPF e RG não 
apresentam repetições.
VII. Os alunos devem estar matriculados em um curso. Cada aluno possui uma 
matrícula, nome, CPF, RG e endereço. Os atributos matrícula, CPF e RG não 
apresentam repetições.
VIII. Os alunos podem se matricular em várias disciplinas, em cada semestre. Quando 
o aluno está cursando uma disciplina, em um dado semestre, deve-se registrar 
as notas 1a. AP, 2a. AP e AF
 
