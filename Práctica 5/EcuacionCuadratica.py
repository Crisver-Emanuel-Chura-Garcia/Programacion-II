import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        return self.b**2 - 4*self.a*self.c

    def getRaiz1(self):
        discriminante = self.getDiscriminante()
        if discriminante >= 0:
            return (-self.b + math.sqrt(discriminante)) / (2 * self.a)
        return None

    def getRaiz2(self):
        discriminante = self.getDiscriminante()
        if discriminante >= 0:
            return (-self.b - math.sqrt(discriminante)) / (2 * self.a)
        return None

    def resolver(self):
        discriminante = self.getDiscriminante()
        if discriminante > 0:
            raiz1 = self.getRaiz1()
            raiz2 = self.getRaiz2()
            print(f"La ecuación tiene dos raíces: {raiz1:.6f} y {raiz2:.6f}")
        elif discriminante == 0:
            raiz = -self.b / (2 * self.a)
            print(f"La ecuación tiene una raíz: {raiz:.6f}")
        else:
            print("La ecuación no tiene raíces reales")

# Ejemplo de uso
a = float(input("Ingrese a: "))
b = float(input("Ingrese b: "))
c = float(input("Ingrese c: "))
ecuacion = EcuacionCuadratica(a, b, c)
ecuacion.resolver()