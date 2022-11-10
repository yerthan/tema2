Algoritmo sin_titulo
	anchura=3
	fila=1
	cambiar=0
	pos=1
	Mientras fila<>0 hacer
		Mientras pos<=fila Hacer
			frase=frase+"*"
			pos=pos+1
		FinMientras
		Si fila<anchura Y cambiar=0 Entonces
			fila=fila+1
		SiNo
			cambiar=1
			fila=fila-1
		Fin Si
		Escribir frase
		frase=""
		pos=1
	FinMientras
FinAlgoritmo
