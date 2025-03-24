import math

def promedio(datos):
    return sum(datos) / len(datos)

def desviacion(datos, promedio_val):
    suma_cuadrados = sum((x - promedio_val) ** 2 for x in datos)
    return math.sqrt(suma_cuadrados / (len(datos) - 1))

def calcular_estadisticas():
    print("Ingrese 10 números separados por espacios:")
    datos = list(map(float, input().split()))
    if len(datos) != 10:
        print("Por favor, ingrese exactamente 10 números.")
        return
    promedio_val = promedio(datos)
    desviacion_val = desviacion(datos, promedio_val)
    print(f"El promedio es {promedio_val:.2f}")
    print(f"La desviación estándar es {desviacion_val:.5f}")

# Ejemplo de uso
calcular_estadisticas()