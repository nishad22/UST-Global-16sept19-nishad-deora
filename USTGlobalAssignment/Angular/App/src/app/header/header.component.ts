import { Component } from '@angular/core';

@Component ({
    selector : 'app-header',
    template : `
    <h1> Header Component </h1>
    `,
    styles : [`
        h1 {
            color :  red;
        }
    `]
})

export class HeaderComponent {
    constructor() {}
}
