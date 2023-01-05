from payment import Payment

class Card(Payment):
    def __init__(self, id) -> None:
        super().__init__(id)