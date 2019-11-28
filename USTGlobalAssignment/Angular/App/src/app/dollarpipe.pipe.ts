import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'dollarpipe'
})
export class DollarpipePipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return '$' + value;
  }

}
