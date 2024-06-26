import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';
import { NoPageFoundComponentComponent } from './no-page-found-component/no-page-found-component.component';
import { AboutCompanyComponent } from './about-company/about-company.component';
import { AboutMeComponent } from './about-me/about-me.component';

const routes: Routes = [
  {
    path:'about',
    component: AboutComponent,
    children:[
      {
        path:'company',
        component:AboutCompanyComponent
      },
      {
        path:'me',
        component:AboutMeComponent
      }
    ]
  },
  {
    path:'user',
    component: UserComponent
  },
  {
    path:'home',
    component: HomeComponent
  },
  {
    path:'user/:dynamicValue',
    component: UserComponent
  },
  {
    path: '**',
    component:NoPageFoundComponentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
