import math

def getDiscriminante(a, b, c):
    return b**2 - 4*a*c

def getRaiz1(a, b, discriminante):
    return (-b + math.sqrt(discriminante)) / (2 * a)

def getRaiz2(a, b, discriminante):
    return (-b - math.sqrt(discriminante)) / (2 * a)

def resolverEcuacionCuadratica(a, b, c):
    discriminante = getDiscriminante(a, b, c)
    if discriminante > 0:
        raiz1 = getRaiz1(a, b, discriminante)
        raiz2 = getRaiz2(a, b, discriminante)
        print(f"La ecuación tiene dos raíces: {raiz1:.6f} y {raiz2:.6f}")
    elif discriminante == 0:
        raiz = -b / (2 * a)
        print(f"La ecuación tiene una raíz: {raiz:.6f}")
    else:
        print("La ecuación no tiene raíces reales")

# Ejemplo de uso
a = float(input("Ingrese a: "))
b = float(input("Ingrese b: "))
c = float(input("Ingrese c: "))
resolverEcuacionCuadratica(a, b, c)