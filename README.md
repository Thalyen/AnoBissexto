# AnoBissexto - TDD

Prática da disciplina de Teste de Software 

Alunas:
- Camila Jordana R. Teixeira
- Tatiana Dantas
- Helora

# Plano de teste: 

Entrada
	- ano: int

Condições

	- ano > 0

Classes Válidas
	
	1-ano%4 == 0 
    -entrada : 4
	2-ano%4 == 0 && ano%400 == 0
    -entrada : 1600
	
Classes inválidas

	3-ano < 0
    -entrada : 0
	4-ano%4 != 0
    -entrada : 5
	5-ano%4 ==0 && ano%100 == 0
    -entrada : 1500


v1.0[Wiki](https://github.com/camilajordana/Pratica_TDD/wiki)
