//import "../../public/favicon.ico"
export default function BootStrapEx()
{
    return(
        <div >
        <div className="mt-5 mb-5 bg-primary text-white rounded">
          <h1 className="display-4">Hello From GFG!</h1>
          <p className="lead">This is a simple Example of using 
          bootstrap in React.</p>
  
          <hr className="my-4" />
          <p>the Component is called jumbotron in bootstrap.</p>
  
          <p className="lead">
            <button 
              className="btn btn-primary btn-lg"  
              >Click me</button>
          </p>
  
        </div>
        <div className="container mb-5" >
        <div className="progress" >
  <div className="progress-bar" style={{width: "50%"}}>50%</div>
</div>
<div style={{height:"30px"}} ></div>
<div className="progress" >
  <div className="progress-bar" style={{width: "25%" }}>25%</div>

 
</div>
<blockquote className="blockquote">
  <p>A well-known quote, contained in a blockquote element.</p>
</blockquote>
<figure>
<figcaption className="blockquote-footer">
    Someone famous in <cite title="Source Title">Source Title</cite>
  </figcaption>
</figure>

<ul className="list-inline">
  <li className="list-inline-item">This is a list item.</li>
  <li className="list-inline-item">And another one.</li>
  <li className="list-inline-item">But they're displayed inline.</li>
</ul>
        </div>
<div>
<img src="favicon.ico" className="rounded float-start" alt=""/>
<img src="favicon.ico" className="rounded float-end" alt=""/>
</div>
<div style={{height:"400px"}}></div>
      </div>
    )
}