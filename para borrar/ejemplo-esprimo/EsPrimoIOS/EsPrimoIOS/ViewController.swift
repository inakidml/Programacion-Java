//
//  ViewController.swift
//  EsPrimoIOS
//
//  Created by widemos on 28/10/15.
//  Copyright © 2015 Ion Jaureguialzo Sarasola. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBOutlet weak var numero: UITextField!
    @IBOutlet weak var resultado: UILabel!
    
    @IBAction func boton(sender: UIButton) {
        
        if esPrimo( Int(numero.text!)! ) {
            resultado.text = "Es primo"
        } else {
            resultado.text = "NO es primo"
        }
        
    }
    
    
    func esPrimo( n: Int ) -> Bool {
        
        var i = 2;
        
        while (i < n && n % i != 0) {
            i++;
        }
        
        if (i < n) {
            return false;
        } else {
            return true;
        }
    }
}

