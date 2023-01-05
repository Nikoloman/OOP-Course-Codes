<?php
class UberX extends Car{
    public $brand;
    public $model;

    public function __construc($license, $driver, $brand, $model){
        parent::__construc($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}
?>