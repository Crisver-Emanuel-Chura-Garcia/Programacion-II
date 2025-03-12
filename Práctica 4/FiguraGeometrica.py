import math

class FiguraGeometrica:

    def area(self, tipo, *args):
        if tipo == "circulo" and len(args) == 1:
            radio = args[0]
            return math.pi * radio**2
        elif tipo == "rectangulo" and len(args) == 2:
            base, altura = args
            return base * altura
        elif tipo == "triangulo" and len(args) == 2:
            base, altura = args
            return (base * altura) / 2
        elif tipo == "trapecio" and len(args) == 3:
            base1, base2, altura = args
            return (base1 + base2) * (altura / 2)
        elif tipo == "hexagono" and len(args) == 2:
            lado, apotema = args
            return 3 * lado * apotema
        else:
            raise ValueError("Parámetros no válidos o tipo desconocido")

f = FiguraGeometrica()

print("RESULTADOS:")
print("Área del círculo:", f.area("circulo", 1))
print("Área del rectángulo:", f.area("rectangulo", 2.0, 3.0))
print("Área del triángulo rectángulo:", f.area("triangulo", 5, 5))
print("Área del trapecio:", f.area("trapecio", 5, 3, 2))
print("Área del hexágono:", f.area("hexagono", 8, 4))
