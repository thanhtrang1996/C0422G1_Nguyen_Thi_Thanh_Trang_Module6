import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HocVienComponent} from './component/hoc-vien/hoc-vien.component';
import {TaoMoiComponent} from './component/tao-moi/tao-moi.component';
import {TopComponent} from './component/top/top.component';


const routes: Routes = [
  {
    path: '',
    component: HocVienComponent
  },
  {
    path: 'create',
    component: TaoMoiComponent
  },
  {
    path: 'top',
    component: TopComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
