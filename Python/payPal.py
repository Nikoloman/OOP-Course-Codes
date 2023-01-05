from payment import Payment

class PayPal(Payment):
    def __init__(self, id) -> None:
        super().__init__(id)