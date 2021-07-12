import { Component, OnInit } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})
export class NavBarComponent implements OnInit {
  // accés fooBarQuix nav-bar
  navItems: ItemWithPath[] = [{ text: 'Accueil', path: 'home' }, { text: 'Foo Bar Quix', path: 'fooBarQuix' }];

  constructor() { }

  ngOnInit(): void {
  }

}
