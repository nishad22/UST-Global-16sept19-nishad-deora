import { Directive, ElementRef, HostBinding, HostListener, ɵɵclassMapInterpolate1 } from '@angular/core';

@Directive({
    selector : '[custDir]'
})

export class CustomDirective {
    constructor(private e1: ElementRef) {
        this.e1.nativeElement.style.backgroundColor = 'black';
        this.e1.nativeElement.style.color = 'red';
    }
    @HostBinding('style.color') colorName = 'green';
    @HostListener('mouseenter') m1() {
        this.e1.nativeElement.style.backgroundColor = 'yellow';
    }
    @HostListener('mouseleave') m2() {
        this.e1.nativeElement.style.backgroundColor = 'burlywood';
    }
}
