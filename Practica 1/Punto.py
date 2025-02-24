import math
class Punto:
    def _init_(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        print(f"Coordenadas Cartesianas: ({self.x}, {self.y})")

    def coord_polares(self):
        r = (self.x*2 + self.y2) * 0.5
        theta = math.atan2(self.y, self.x)
        print(f"Coordenadas Polares: (r = {r}, θ = {theta})")

    def _str_(self):
        return f"Punto(x={self.x}, y={self.y})"