import matplotlib.pyplot as plt
class Circulo:
    def __init__(self, centro:Punto, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo con centro {self.centro} y radio {self.radio}"
    
    def dibujaCirculo(self):
        centro = (self.centro.getX(), self.centro.getY())
        radio = self.radio
        
        fig, ax = plt.subplots()
        
        circulo = plt.Circle(centro, radio, color='b', fill=False)
        
        # Agregar el círculo al gráfico
        ax.add_patch(circulo)

        # Configurar límites del gráfico (Default)
        ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1)
        ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)

        # Mostrar ejes en la misma escala
        ax.set_aspect('equal')

        # Mostrar el gráfico
        plt.show()

p = Punto(5,5)
circulo = Circulo(p, 3)
print(circulo)
circulo.dibujaCirculo()   