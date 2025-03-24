import math

class Estadisticas:
    def __init__(self, datos):
        self.datos = datos

    def promedio(self):
        return sum(self.datos) / len(self.datos)

    def desviacion(self):
        promedio_val = self.promedio()
        suma_cuadrados = sum((x - promedio_val) ** 2 for x in self.datos)
        return math.sqrt(suma_cuadrados / (len(self.datos) - 1))

    def mostrar_resultados(self):
        promedio_val = self.promedio()
        desviacion_val = self.desviacion()
        print(f"El promedio es {promedio_val:.2f}")
        print(f"La desviación estándar es {desviacion_val:.5f}")

# Ejemplo de uso
print("Ingrese 10 números separados por espacios:")
datos = list(map(float, input().split()))
if len(datos) != 10:
    print("Por favor, ingrese exactamente 10 números.")
else:
    estadisticas = Estadisticas(datos)
    estadisticas.mostrar_resultados()